def findTopper(marks):
    best_row,best_total=0,-1
    for i,row in enumerate(marks):
        total=sum(row)
        if total>best_total:
            best_row,best_total=i,total
    return (best_row,best_total)

if __name__=="__main__":
    print(findTopper([[78,85,90],[88,92,79],[65,70,95]]))