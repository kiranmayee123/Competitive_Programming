def reconstructQueue(list_people):
    list_people=sorted(list_people)
    list_people.reverse()
    for i in range(len(list_people)-1):
        if(list_people[i][0]==list_people[i+1][0]):
            if(list_people[i][1]>list_people[i+1][1]):
                list_people[i],list_people[i+1]=list_people[i+1],list_people[i]
                i=0
    result = []
    for people in list_people:
        result.insert(people[1], people)
    print(result)

reconstructQueue([[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]])
reconstructQueue([[12,0],[6,3],[3,4],[9,2], [11,1],[1,5]])
reconstructQueue([ [2,4], [5,1], [3,3], [1,5], [4,2], [6,0]])