package seedu.addressbook.logic;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.Storage;

public class StorageStub extends Storage{
	private String path;
	private AddressBook addressbook;
	
	public StorageStub(String path){
		this.path = path;
	}
	
	@Override
	public void save(AddressBook addressbook) throws StorageOperationException{
		this.addressbook = addressbook;
	}
	
	@Override
	public AddressBook load() throws StorageOperationException{
		return this.addressbook;
	}
	
	@Override
	public String getPath(){
		return this.path;
	}
}
