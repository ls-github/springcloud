package cn.ctgu.firstdemo.collection;

import java.util.*;

public class MyHashMap<K,V> {

    static class Node<K,V>{
        private K key;
        private V value;
        private Node next;

        public Node(K key,V value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    private final int defaultSize=16;
    private Node [] nodeList;
    private int size;
    private int capcity;
    public MyHashMap(){
        this(16);
    }


    public MyHashMap(int capcity){
        nodeList=new Node[capcity];
        this.capcity=capcity;
    }

    public Node[] getNodeList() {
        return nodeList;
    }

    public void put(K key, V value){
        int index= key.hashCode()%defaultSize;

        Node firstNode=nodeList[0];
        if(firstNode==null){
            //放入List
            Node node=new Node(key,value,null);
            nodeList[index]=node;
        }else{
            // 找有没有相同的key
            while (firstNode!=null){
                if(firstNode.key.equals(key)){
                    firstNode.value=value;
                    return;
                }
                firstNode=firstNode.next;
            }
            // 新建node
            Node node=new Node(key,value,nodeList[0]);
            nodeList[index]=node;
        }

    }

    public V get(K key){
        int index=key.hashCode()%defaultSize;
        Node<K,V> firstNode=nodeList[index];
        if(firstNode==null){
            return null;
        }else{
            //循环找
            while (firstNode!=null){
                if(firstNode.key.equals(key)){
                    return firstNode.value;
                }
                firstNode=firstNode.next;
            }
            return  null;
        }

    }

    public static void main(String[] args) {

        HashMap hashMap=new HashMap();
        hashMap.put(null,"zhangsan");
        System.out.println(hashMap.get(null));

        Hashtable hashtable=new Hashtable();
        hashtable.put(null,"aa");
        System.out.println(hashtable.get(null));



//        new Hashtable<>().put(null,"aa");


        MyHashMap<String,String> myHashMap=new MyHashMap<>();
        myHashMap.put("name1","zhangan");
        myHashMap.put("name2","lisi");

//        for(int i=0;i<20;i++){
//            myHashMap.put("name"+i,"zhangsan"+i);
//        }
//        System.out.println(myHashMap);


//        System.out.println(myHashMap.get("name1"));
//        System.out.println(myHashMap.get("name2"));
//        System.out.println("========================");
//        myHashMap.put("name1","wangwu");
//        System.out.println(myHashMap.get("name1"));

//        HashMap<String,Object>  hashMap=new HashMap(32);
//        hashMap.put("name","zhangsan");
//        hashMap.put("age",18);
//
//        System.out.println("name".hashCode());
//        System.out.println("age".hashCode());
//
//        hashMap.put("name","zhangsan");
//        hashMap.put("age",18);
//        System.out.println("key".hashCode());
//        System.out.println("key".hashCode());
        System.out.println(1>>>2);
        List list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.forEach(item-> System.out.println(item));
//        Arrays.asList(null);





    }





}
