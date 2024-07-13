def solution(record):
    answer = []
    
    ENTER_MSG = "{0}님이 들어왔습니다."
    LEAVE_MSG = "{0}님이 나갔습니다."
    
    usersMap = {}
    
    for data in record:
        dataSplitted = data.split()
            
        if (len(dataSplitted) == 3):
            usersMap[dataSplitted[1]] = dataSplitted[2]
    
    for data in record:
        if (data.startswith("Enter")):
            id = data.split()[1]
            answer.append(ENTER_MSG.format(usersMap[id]))
        
        if (data.startswith("Leave")):
            id = data.split()[1]
            answer.append(LEAVE_MSG.format(usersMap[id]))
    
    return answer