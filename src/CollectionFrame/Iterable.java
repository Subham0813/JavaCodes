package CollectionFrame;

interface Iterable {
}
interface Collections extends Iterable{

}
interface List extends Collections {

}
class ArrayList implements List{

}
class LinkedList implements List{

}
class Vector implements List{

}
class Stack extends Vector{

}

interface Queue extends Collections{

}
class PriorityQueue implements Queue{

}
interface Deque extends Queue {

}
class ArrayDeque implements Deque{

}
interface Set extends Collections{

}
class HashSet implements Set{

}
class LinkedHashSet implements Set{

}
interface SortedSet extends Set{

}
class treeSet implements SortedSet{

}
