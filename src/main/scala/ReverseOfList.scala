// Scala program of reversing a list order
import scala.collection.immutable._

// Creating object
object reverseOfList{
  // Main method


  def main(args:Array[String]){

    val mylist = List(1, 2, 3, 4, 5)
    val list_reversed = reverse(mylist)
     println("Reverse of list : " +list_reversed)
  }
  // Method to reverse a list
  def reverse(mylist: List[Int]): List[Int] = {
    if(mylist==List()) {
      mylist
    }
    else{
      reverse(mylist.tail) :+ mylist.head
    }
  }



}

