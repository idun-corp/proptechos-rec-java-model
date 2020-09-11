package com.proptechos.model.common;


import com.proptechos.model.Alias;
import java.util.List;

public interface IForeignSystemObject {

    void setHasAliases(List<Alias> alias);

    List<Alias> getHasAliases();

}
