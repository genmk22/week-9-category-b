def countAlerts(readings,k,threshold):
    window=sum(readings[:k])
    count=1 if window>=k*threshold else 0
    for i in range(k,len(readings)):
        window+=readings[i]-readings[i-k]
        if window>=k*threshold:
            count+=1
    return count

if __name__=="__main__":
    print(countAlerts([2,2,2,2,5,5,5,8],3,4))