class Solution:
    def reverse(self, x: int) -> int:
        if x>0:
            if(int(str(x)[::-1]))>(2**31) :
                return 0
            else:
                return (int(str(x)[::-1]))
        elif x<0:
                if(-1*int(str(x)[1:][::-1]))<-2**31:
                    return 0
                else:
                    return (-1*int(str(x)[1:][::-1]))
        else:
            return 0
                
            