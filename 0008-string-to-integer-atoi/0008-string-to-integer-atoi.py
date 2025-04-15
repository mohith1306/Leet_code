class Solution:
    def myAtoi(self, s: str) -> int:
        ans = ""
        flag = 1
        max_int = 2**31 - 1
        min_int = -2**31
        started = False
        for i in s:
            if i == ' ' and not started:
                continue
            elif i == '-' and not started:
                flag = -1
                started = True
            elif i == '+' and not started:
                flag = 1
                started = True
            elif not i.isdigit():
                break
            else:
                if not i.isdigit():
                    break
                ans += i
                started = True
        if len(ans) == 0:
            return 0
        result = flag * int(ans)
        if result < min_int:
            return min_int
        elif result > max_int:
            return max_int
        return result
