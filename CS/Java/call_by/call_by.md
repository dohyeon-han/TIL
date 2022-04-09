## Call by value, Call by reference
- 함수 호출 시 인자를 전달하는 방식을 두가지로 나눌 수 있다.

### Call by value
- 인자로 받은 값을 복사하여 전달한다.
- 인자의 값이 함수 내부에서 바뀌어도 함수 외부에는 영향을 끼치지 않는다.

### Call by reference
- 인자로 받은 값의 주소를 전달한다.
- 값을 변경하면 함수 외부에 영향을 준다

### Java에서의 호출 방식
- java는 call by value를 사용한다.
```java
public class Swap {
    int value;

    public static void swap(Integer a, Integer b){ // 객체의 주소를 '복사'
        // 실제로 swap 되지 않는다.
        // a가 b의 주소를 가리키고, b가 a의 주소를 가리키더라도
        // swap 메소드 안에서만 지역 변수 a, b의 값이 바뀐다.
        Integer tmp = a;
        a = b;
        b = tmp;
    }
}
```
- call by reference처럼 사용하기 위해서는 객체를 사용하여 객체 내부의 값을 변경하면 된다.
```java
public class Swap {
    int value;

    public static void swap(Swap a, Swap b){ // 객체의 주소를 '복사'
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

    public Swap(int num){
        this.value = num;
    }
}
```
- swap 메소드를 사용하면 객체의 주소가 지역 변수로 복사가 되고, 그 지역 변수를 통해 heap 영역의 객체로 접근하여 객체 내부의 값을 변경할 수 있다.