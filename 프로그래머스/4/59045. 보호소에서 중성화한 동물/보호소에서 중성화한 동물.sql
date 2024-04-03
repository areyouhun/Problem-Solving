select ai.animal_id,
    ai.animal_type,
    ai.name
from animal_ins ai
join animal_outs ao on ai.animal_id = ao.animal_id
where regexp_like(ai.sex_upon_intake, 'Intact')
    and regexp_like(ao.sex_upon_outcome, 'Spayed|Neutered')