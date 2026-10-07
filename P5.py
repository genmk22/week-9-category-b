def findSlot(prices,newPrice):
    low,high=0,len(prices)
    while low<high:
        mid=(low+high)//2
        if prices[mid]<newPrice:
            low=mid+1
        else:
            high=mid
    return low

if __name__=="__main__":
    print(findSlot([120,150,200,260],210))