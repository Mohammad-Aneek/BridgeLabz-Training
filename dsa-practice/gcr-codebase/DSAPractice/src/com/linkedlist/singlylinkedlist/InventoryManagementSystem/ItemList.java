package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

import java.util.Comparator;

public class ItemList {
	private ItemNode head;
	private ItemNode tail;
	private int size;

	public ItemList() {
		head = tail = null;
		size = 0;
	}

	// to add Item at beginning of list
	public void addItemAtBeginning(int id, String name, double price, int quantity) {
		if (quantity <= 0) {
			return;
		} else if (head == null) {
			// if list is empty
			head = tail = new ItemNode(id, name, price, quantity);
			size++;
		} else {
			// if list is not empty
			ItemNode newNode = new ItemNode(id, name, price, quantity);
			newNode.next = head;
			head = newNode;
			size++;
		}
	}

	// to add item at end of list
	public void addItemAtEnd(int id, String name, double price, int quantity) {
		if (quantity <= 0) {
			return;
		} else if (head == null) {
			// if list is empty
			head = tail = new ItemNode(id, name, price, quantity);
			size++;
		} else {
			// if list is not empty
			ItemNode newNode = new ItemNode(id, name, price, quantity);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// to add Item at a specific position
	public void addItemAtPosition(int id, String name, double price, int quantity, int position) {
		if (position < 0 || position > size) {
			// check for invalid index for insert
			// throw new ArrayIndexOutOfBoundsException();
			System.out.println("Invalid index!");
		} else if (position == 0) {
			// position 0 means start of list
			addItemAtBeginning(id, name, price, quantity);
		} else if (position == size) {
			// position size means end of list
			addItemAtEnd(id, name, price, quantity);
		} else if (quantity > 0) {
			ItemNode temp = head;
			int i = 0;
			while (i < position - 1) {
				i++;
				temp = temp.next;
			}
			ItemNode newNode = new ItemNode(id, name, price, quantity);
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}

	// private method to search for an Item using id
	private final ItemNode findItem(int id) {
		ItemNode temp = head;
		while (temp != null && !temp.isID(id)) {
			temp = temp.next;
		}
		return temp;
	}

	// private method to search for an Item using name
	private final ItemNode findItem(String name) {
		ItemNode temp = head;
		while (temp != null && !temp.isName(name)) {
			temp = temp.next;
		}
		return temp;
	}

	// to display a specific Item using id
	public void displayItem(int id) {
		ItemNode node = findItem(id);
		if (node == null) {
			System.out.println("No Item with id " + id);
		} else {
			System.out.println("Item Details: \n");
			node.display();
		}
	}

	// to display a specific Item using name
	public void displayItem(String name) {
		ItemNode node = findItem(name);
		if (node == null) {
			System.out.println("No Item with name " + name);
		} else {
			System.out.println("Item Details: \n");
			node.display();
		}
	}

	// to display all Items
	public void displayItems() {
		ItemNode temp = head;
		if (temp == null) {
			System.out.println("No Item");
		} else {
			System.out.println("Item List: \n");
			while (temp != null) {
				temp.display();
				temp = temp.next;
			}
		}
	}

	// to delete a student
	public void deleteItem(int id) {
		ItemNode temp = head;
		if (temp == null) {
			return;
		} else if (temp.isID(id)) {
			// if the node to be deleted is the head then move head
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
		} else {
			while (temp.next != null && !temp.next.isID(id)) {
				temp = temp.next;
			}

			if (temp.next != null) {
				if (temp.next == tail) {
					// if the node to be deleted is tail move tail
					tail = temp;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
	}

	// to update quantity of an item where item with 0 quantity cant exist
	public void updateQuantity(int id, int quantity) {
		if (quantity < 0) {
			System.out.println("Invalid quantity!");
			return;
		} else if (quantity == 0) {
			deleteItem(id);
		} else {
			ItemNode node = findItem(id);
			if (node != null) {
				node.setQuantity(quantity);
			}
		}
	}

	public double getTotalValue() {
		double total = 0;
		ItemNode temp = head;
		while (temp != null) {
			total += temp.getTotalPrice();
			temp = temp.next;
		}
		return total;
	}

	private void sort(Comparator<ItemNode> comparator) {
		if (head == null || head.next == null) {
			return;
		}

		head = mergeSort(head, comparator);
		tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
	}

	private ItemNode mergeSort(ItemNode node, Comparator<ItemNode> comparator) {
		if (node == null || node.next == null)
			return node;

		ItemNode middle = getMiddle(node);
		ItemNode nextToMiddle = middle.next;
		middle.next = null;

		ItemNode left = mergeSort(node, comparator);
		ItemNode right = mergeSort(nextToMiddle, comparator);

		return sortedMerge(left, right, comparator);
	}

	private ItemNode sortedMerge(ItemNode a, ItemNode b, Comparator<ItemNode> comparator) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		ItemNode result;
		if (comparator.compare(a, b) <= 0) {
			result = a;
			result.next = sortedMerge(a.next, b, comparator);
		} else {
			result = b;
			result.next = sortedMerge(a, b.next, comparator);
		}
		return result;
	}

	private ItemNode getMiddle(ItemNode head) {
		if (head == null)
			return head;
		ItemNode slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public void sortName(boolean asc) {
		sort((a, b) -> asc ? a.compareName(b) : b.compareName(a));
	}

	public void sortPrice(boolean asc) {
		sort((a, b) -> asc ? a.comparePrice(b) : b.comparePrice(a));
	}
}
