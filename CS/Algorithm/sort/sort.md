# Sort

## Bubble Sort (거품 정렬)
![image](https://raw.githubusercontent.com/GimunLee/tech-refrigerator/master/Algorithm/resources/bubble-sort-001.gif)<br>
https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/resources/bubble-sort-001.gif

### 장점
- 구현이 간단하다.
- 추가적인 메모리 소비가 적다.
- 이미 정렬된 경우 시간 복잡도가 O(N)으로 효울적이다.

### 단점
- 정렬 시간이 오래 걸린다.

## Selection Sort (선택 정렬)
![image](https://raw.githubusercontent.com/GimunLee/tech-refrigerator/master/Algorithm/resources/selection-sort-001.gif)<br>
https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/resources/selection-sort-001.gif

### 장점
- 구현이 간단하다.
- 추가적인 메모리 소비가 적다.
- Bubble sort에 비해 데이터 교환의 횟수가 적다. 

### 단점
- 이미 정렬된 상태를 포함한 모든 경우에 O(N<sup>2</sup>)가 걸리므로 비효율적이다.

## Insertion Sort (삽입 정렬)
![image](https://raw.githubusercontent.com/GimunLee/tech-refrigerator/master/Algorithm/resources/insertion-sort-001.gif)<br>
https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/resources/insertion-sort-001.gif

### 장점
- 구현이 간단하다.
- 추가적인 메모리 소비가 적다.
- 이미 정렬된 경우 시간 복잡도가 O(N)으로 효울적이다.

### 단점
- 정렬 시간이 오래 걸린다.

## Quick Sort
![image](https://raw.githubusercontent.com/GimunLee/tech-refrigerator/master/Algorithm/resources/quick-sort-001.gif)<br>
https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/resources/quick-sort-001.gif

- 피벗을 기준으로 양쪽을 교환하는 분할 정복 알고리즘이다.

### 장점
- 한 번 자리가 결정된 피벗은 이후 계산이 포함되지 않고 함수를 내부적을 호출할수록 교환하는 배열의 범위가 좁아져 참조의 지역성으로 인해 시간 복잡도가 O(N logN)인 다른 알고리즘에 비해 더 빠르다.
- 일반적으로 O(logN)의 공간복잡도를 갖는다.

### 단점
- 이미 정렬된 데이터의 경우 느리고 공간 복잡도도 O(N)으로 증가한다.

## Merge Sort (병합 정렬)
![1_D-cvYWgrOnHwm6Xg8INzFg](https://user-images.githubusercontent.com/63232876/164980592-89b3c79e-8772-46e9-8299-c36b377365d3.gif)<br>
https://thinkdiff.net/merge-sort-swift-e0e77f520f89

### 장점
- 모든 입력에 대해 O(N logN)의 시간이 걸린다.
- head부터 탐색해야하는 linked list의 정렬 시 유용하다.
### 단점
- 배열로 구현할 경우 데이터 간의 이동이 많기 때문에 다른 O(N logN)알고리즘에 비해 비효율적이고 입력의 크기만큼의 공간이 추가로 필요하다.

## Heap Sort
![Heap_sort_example](https://user-images.githubusercontent.com/63232876/164982603-185a7db8-735d-4e65-82fa-1ed0ea514030.gif)<br>
https://commons.wikimedia.org/wiki/File:Heap_sort_example.gif

- 처음 배열을 max heap으로 만든 후 leaf node와 root node를 바꿔가며 정렬한다
- heap construction 시 Top-down 방식과 Bottom-up 방식이 존재하는데, Top-down의 경우 heap에 원소를 하나씩 더 하는 방식으로 O(N logN)이 걸리는 반면, Bottom-up은 정렬되지 않은 트리에서 leaf node부터 정렬하기 때문에 O(N)으로 정렬이 가능하므로 후자의 방식이 더 유용하다.

### 장점
- 추가적인 메모리 소비가 적다.
- 모든 경우에 O(N logN)이 걸린다.
### 단점
- swap이 많이 발생하기 때문에 평균적으로 다른 O(N logN) 정렬에 비해 느리다.



![image](https://user-images.githubusercontent.com/63232876/164023574-b79a42b0-d4f5-4e3f-80db-e7ed66663b70.png)