package pertemuan6;


public class strukturList {
	private Node HEAD;
	    
	    
	    public boolean isEmpty() {
	        return HEAD == null;
	    }
	    
	   
	    public void addHead(int data) {
	        Node newnode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newnode;
	        } else {
	            newnode.setNext(HEAD);
	            HEAD = newnode;
	        }
	    }
	    
	   
	    public void addTail(int data) {
	        Node newnode = new Node(data);
	        if (isEmpty()) {
	            HEAD = newnode;
	        } else {
	            Node curNode = HEAD;
	            Node posNode = null;
	            while (curNode != null) {
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newnode);
	        }
	    }

	    public void addMiddle(int data, int pos) {
	        Node newnode = new Node(data);
	        Node curNode = HEAD;
	        if (isEmpty()) {
	            HEAD = newnode;
	        } else {
	            Node posNode = null;
	            if (pos == 1) {
	                newnode.setNext(HEAD);
	                HEAD = newnode;
	            } else {
	                int i = 1;
	                while (curNode != null && i < pos) {
	                    posNode = curNode;
	                    curNode = curNode.getNext();
	                    i++;
	                }
	                posNode.setNext(newnode);
	                newnode.setNext(curNode);
	            }
	        }
	    }

	   
	    public void removeHead() {
	        if (isEmpty()) {
	            System.out.println("List Kosong");
	        }
	        else {
	            Node temp = HEAD;
	            HEAD = HEAD.getNext();
	        }
	    }

	    public void removeTail() {
	        Node preNode = null;
	        Node lastNode = null;

	        if (HEAD != null) {
	            if (HEAD.getNext() == null) {
	                HEAD = null;
	            } else {
	                lastNode = HEAD;
	                while (lastNode.getNext() != null) {
	                    preNode = lastNode;
	                    lastNode = lastNode.getNext();
	                }
	                preNode.setNext(null);
	                lastNode.setNext(null);
	                lastNode = null;
	            }
	        }
	    }

	    public void removeMid(int e) {
	        Node preNode = new Node(0);
	        Node tempNode;
	        int i;
	        boolean ketemu;

	        if (isEmpty()) {
	            System.out.println("Elemen list kosong");
	        } else {
	            ketemu = false;
	            i = 1;
	            tempNode = HEAD;
	            while (tempNode.getNext() != null && !ketemu) {
	                if (tempNode.getdata() == e) {
	                    ketemu = true;
	                } else {
	                    preNode = tempNode;
	                    tempNode = tempNode.getNext();
	                    i++;
	                }
	            }

	            if (ketemu == true) {
	                if (i == 1) {
	                    HEAD = null;
	                } else {
	                    preNode.setNext(tempNode.getNext());
	                }
	            }
	        }
	    }

	    public void displayElement() {
	        Node curNode = HEAD;

	        while(curNode != null) {
	            System.out.print(curNode.getdata()+ " ");
	            curNode = curNode.getNext();
	        }
	    }
	    public boolean find (int x) {
	    	Node curNode = HEAD;
	    	Boolean ketemu = false;
	    	
	    	while (curNode != null && !ketemu) {
	    		if (curNode.getdata() == x)
	    			ketemu = true;
	    		else
	    			curNode = curNode.getNext();
	    	}
	    	return ketemu;
	    	}
	    
	    public int size() {
	        int count = 0;
	        Node curNode = HEAD;
	        
	        while (curNode != null) {
	            count++;
	            curNode = curNode.getNext();
	        }
	        
	        return count;
	    }
	    public int deleteList() {
	    	HEAD = null;
	    	return 0;
	    
	    }   
}

