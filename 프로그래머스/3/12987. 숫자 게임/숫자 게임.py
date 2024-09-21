import heapq

def solution(A, B):
    B = sorted(B)
    A = sorted(A)
    
    if B[len(B) - 1] <= A[0]:
        return 0
    
    maxScore = 0
    for numberB in B:
        if numberB - A[0] > 0:
            maxScore += 1
            A.remove(A[0])
    
    return maxScore