package com.example.enieber.go.model.go;

import android.provider.ContactsContract;

import com.example.enieber.go.model.base.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class Daily extends BaseModel {

    public String summary;
    public String icon;
    public List<ContactsContract.Contacts.Data> data = new ArrayList<>();

}