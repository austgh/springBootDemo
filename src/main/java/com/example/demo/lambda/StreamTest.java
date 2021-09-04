package com.example.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by think on 2020/11/29.
 */
public class StreamTest {
    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();
//        gen5();
        //打印偶数
        Arrays.asList(1,2,3,4,5).stream().filter(x->x%2 ==0).forEach(System.out::println);
        //偶数求和
        int sum = Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> max = integers.stream().max((a, b) -> a-b);
        System.out.println(max.get());

        Optional<Integer> min = integers.stream().min((a, b) -> a - b);
        System.out.println(min.get());

        Optional<Integer> first = integers.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());

        Stream<Integer> integerStream = integers.stream().filter(x -> {
            System.out.println("运行代码");
            return x % 2 == 0;
        });
        System.out.println(integerStream.findAny().get());//一个一个执行

        //获取最大值最小值 不适用 max min
        Optional<Integer> first1 = integers.stream().sorted().findFirst();
        System.out.println(first1.get());

        Arrays.asList("java","c#","python","scala").stream().sorted().forEach(System.out::println);
        Arrays.asList("java","c#","python","scala").stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
        List<Integer> collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("-------------------------");
        //去重操作
        Arrays.asList(1,2,3,4,3,3,5).stream().distinct().forEach(System.out::println);
        Arrays.asList(1,2,3,4,3,3,5).stream().collect(Collectors.toSet()).forEach(System.out::println);
        //打印20-30
        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);

        String str = "11,22,33,44,55";
        System.out.println(Stream.of(str.split(",")).mapToInt(x->Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).map(x->Integer.valueOf(x)).mapToInt(x->x).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());

        //创建一组自定义对象
        String str2 = "java,scala,python";
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);
    }


    //数组转stream
    static void gen1(){
        String[] str = {"a","b","c","d"};
        Stream<String> str1 = Stream.of(str);
        str1.forEach(System.out::println);
    }
    static void gen2(){
        //通过集合获取stream 对象
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
    static void gen3(){
        //通过generate 获取Stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        generate.limit(10).forEach(System.out::println);
    }
    static void gen4(){
        //使用 iterate
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(5).forEach(System.out::println);
    }
    static void gen5(){
        //其他方式
        String str = "abcdef";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);

    }
}
