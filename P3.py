def mostPopular(orders):
    counts={}
    for item in orders:
        counts[item]=counts.get(item,0)+1
    best=orders[0]
    for item in orders:
        if counts[item]>counts[best]:
            best=item
    return (best,counts[best])

if __name__=="__main__":
    print(mostPopular(["dosa","idli","vada","dosa","idli","dosa","tea"]))