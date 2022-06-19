import java.util.Scanner;
class Node{
int data;
Node prev, next;
}
class DLL{
Scanner sc = new Scanner(System.in);
private Node head, tail;
DLL()
{
head = null;
58
tail = null;
}
private void ins(){
Node n = new Node();
System.out.print("Enter data to be inserted: ");
n.data = sc.nextInt();
n.next = head;
n.prev = null;
if(head != null)
head.prev = n;
else
tail = n;
head = n;
System.out.println("\tInserted " + n.data + ".");
}
private void del(){
if(head == null && tail == null){
System.out.print("\tNo element in DList to be deleted.");
return;
}
int item, flag = 0;
System.out.print("\tEnter element to delete: ");
item = sc.nextInt();
Node temp;
for(temp = head; temp != null; temp = temp.next){
59
if(temp.data == item)
{
flag = 1;
break;
 }
}
if(flag == 0){
System.out.print("\tElement not found");
return;
}
if(temp.prev != null && temp.next != null)
{
temp.prev.next = temp.next;
temp.next.prev = temp.prev;
}
else if(temp.prev == null && temp.next == null)
{
head = null;
tail = null;
}
else if(temp.prev == null)
{
head = temp.next;
temp.next.prev = null;
}
else
{ 
60
tail = temp.prev;
temp.prev.next = null;
}
System.out.println(" deleted the element " + item);
}
private void display()
{
if(head == null && tail == null){
System.out.println("Empty List");
}
else
{
System.out.println("Doubly List");
Node temp;
for(temp = head; temp != null; temp = temp.next)
System.out.println(temp.data);
}
}
public void f(){
while(true){
System.out.println("\nDoubly Linked List");
System.out.print("1. Insert 2. Delete 3. Display 4. Quit\nEnter
Choice: ");
int ch = sc.nextInt();
switch(ch){
61
case 1: ins(); break; 
 case 2: del(); break;
case 3: display(); break;
default : return;
}
}
}
}
class List{
public static void main(String[] args){
DLL obj = new DLL();
obj.f();
}
}
