/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let set = new Set();
    let result = 0;
    let i = 0;
    let j = 0;

    while (i < s.length && j < s.length) {
        if (!set.has(s[j])) {
            set.add(s[j]);
            j++;
            result = Math.max(result, j - i);
        } else {
            set.delete(s[i]);
            i++;
        }
    }

    return result;
};
