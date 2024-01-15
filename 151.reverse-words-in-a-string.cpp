/*
 * @lc app=leetcode id=151 lang=cpp
 *
 * [151] Reverse Words in a String
 */
#include <iostream>
#include <sstream>
#include <vector>

using namespace std;
// @lc code=start
class Solution
{
public:
    string reverseWords(string s)
    {
        // Using stringstream to split words
        std::stringstream ss(s);
        std::vector<std::string> words;
        std::string word;

        // Extract words from the string
        while (ss >> word)
        {
            words.push_back(word);
        }

        // Construct the reversed string
        std::string result;
        for (int i = words.size() - 1; i >= 0; --i)
        {
            result += words[i];
            if (i > 0)
            {
                result += " ";
            }
        }

        return result;
    }
};
// @lc code=end
