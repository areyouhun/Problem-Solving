import re

def solution(skill, skill_trees):   
    valid_skill_trees = []
    
    for skill_tree in skill_trees:
        if ((re.compile(f"^[^{skill}]*$")).match(skill_tree)):
            valid_skill_trees.append(skill_tree)
        elif ((skill[0] in skill_tree) and (re.sub(f'[^{skill}]', "", skill_tree) in skill)):
            valid_skill_trees.append(skill_tree)
          
    print(skill_trees)
    print(valid_skill_trees)

    return len(valid_skill_trees)