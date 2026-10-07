def mergeTokens(counterA,counterB):
    i=j=0
    result=[]
    while i<len(counterA) and j<len(counterB):
        if counterA[i]<=counterB[j]:
            result.append(counterA[i]);i+=1
        else:
            result.append(counterB[j]);j+=1
    result.extend(counterA[i:]);result.extend(counterB[j:])
    return result

if __name__=="__main__":
    print(mergeTokens([3,8,15,20],[5,8,12]))