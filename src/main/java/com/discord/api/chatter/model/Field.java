package com.discord.api.chatter.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Field {
    private String name;
    private String value;
    private boolean inline;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getInline() {
        return inline;
    }

    public void setInline(boolean inline) {
        this.inline = inline;
    }

    @Override
    public String toString() {
        return "Field [name=" + name + ", value=" + value + ", inline=" + inline + "]";
    }
    
}
