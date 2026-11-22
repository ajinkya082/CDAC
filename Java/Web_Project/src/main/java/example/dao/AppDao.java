package example.dao;

public interface AppDao<T,ID> {
	//Methods for handling CRUD operations
	T getById(ID identity);
	//void create(T newData);
	//collection<T> getAll();
	//void deleteById(ID identity);
	//void update(t updateData);
	
}
