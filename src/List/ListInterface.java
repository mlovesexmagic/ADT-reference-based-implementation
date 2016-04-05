package List;
// ****************************************************
// Lab 3			Authors: Zhipeng Mei, Vince Garcia
// Class: CS 111C		Date:	 4/6/16
// ****************************************************
// Interface for the ADT list
// ****************************************************
public interface ListInterface {
  // list operations:
  public boolean isEmpty();

  public int size();

  public void add(int index, Object item);

  public void remove(int index);

  public Object get(int index)
                       ;
  public void removeAll();
} // end ListInterface
