def solution(n, lost, reserve):
    students = list(range(1, (n + 1)))  
    _lost = list(set(lost) - set(reserve))
    _reserve = list(set(reserve) - set(lost))
    
    for i in _reserve:
        if i in _lost:
            _lost.remove(i)
            continue
        elif ((i - 1) in _lost):
            _lost.remove(i - 1)
            continue
        elif ((i + 1) in _lost):
            _lost.remove(i + 1)
            continue
            
    return len(set(students) - set(_lost))