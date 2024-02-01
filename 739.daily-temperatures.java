/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Số lượng ngày
        int n = temperatures.length;
        
        // Mảng để lưu kết quả, ban đầu tất cả đều là 0
        int[] answer = new int[n];
        
        // Stack để lưu index của các ngày chưa tìm được ngày nóng hơn
        Stack<Integer> stack = new Stack<>();

        // Duyệt qua mảng nhiệt độ hàng ngày
        for (int i = 0; i < n; i++) {
            // Kiểm tra nếu stack không rỗng và nhiệt độ hiện tại lớn hơn nhiệt độ ở đỉnh stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // Lấy index của ngày trước đó ra khỏi stack
                int prevIndex = stack.pop();
                
                // Tính số ngày cần phải đợi để có nhiệt độ cao hơn
                answer[prevIndex] = i - prevIndex;
            }
            
            // Đưa index của ngày hiện tại vào stack
            stack.push(i);
        }

        // Kết quả là mảng chứa số ngày cần đợi tương ứng với từng ngày
        return answer;
    }
}

// @lc code=end

