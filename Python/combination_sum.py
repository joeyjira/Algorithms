class Solution:
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        def comb_sum_util(candidates, target, i, lst):
            if target < 0 or i >= len(candidates):
                return
            if target == 0:
                res.append(lst)
                return
            comb_sum_util(candidates, target - candidates[i], i, lst + [candidates[i]])
            comb_sum_util(candidates, target, i + 1, lst)
        res = []
        comb_sum_util(candidates, target, 0, [])
        return res
