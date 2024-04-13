results = {"RT": {"R": 0, "T": 0}, 
          "CF": {"C": 0, "F": 0},
          "JM": {"J": 0, "M": 0},
          "AN": {"A": 0, "N": 0}}
          
middle_number = 4

def solution(survey, choices):
    for idx in range(len(survey)):
        if (choices[idx] // middle_number == 0):
            results[''.join(sorted(survey[idx]))][survey[idx][0]] += (4 - choices[idx])
        else:
            results[''.join(sorted(survey[idx]))][survey[idx][1]] += (choices[idx] - 4)
    
    answer = ''
    for value in results.values():
        personality_type = sorted(value.items(), key = lambda item:item[1], reverse = True)[0][0]
        answer += personality_type
    return answer