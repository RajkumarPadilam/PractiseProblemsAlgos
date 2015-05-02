import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FlattenIterator implements Iterator {
    ArrayList<Object> al;
    int count;
    public FlattenIterator(ArrayList a) {
    	al = new ArrayList();
	flatten(a);
    }
    public void flatten(ArrayList a) {
	Iterator it = a.iterator();
	while(it.hasNext()) {
	    Object o = it.next();
	    if(o instanceof Collection) {
		al.addAll((Collection) o);
	    }
	    else {
		al.add(o);
	    }
	}
    }
    @Override
    public boolean hasNext() {
	// TODO Auto-generated method stub
	return count < al.size();
    }
    
    @Override
    public Object next() {
	// TODO Auto-generated method stub
	return al.get(count++);
    }
    
    @Override
    public void remove() {
	// TODO Auto-generated method stub
		
    }

}