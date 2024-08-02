/*
 * This file is generated by jOOQ.
 */
package org.example.mtgspotscrapper.model.databaseClasses;


import java.util.Arrays;
import java.util.List;

import org.example.mtgspotscrapper.model.databaseClasses.tables.Cards;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Fullcarddata;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Fulllistdata;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Listcards;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Lists;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Listslogos;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Localaddresses;
import org.example.mtgspotscrapper.model.databaseClasses.tables.Namesandmultiverseid;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.cards</code>.
     */
    public final Cards CARDS = Cards.CARDS;

    /**
     * The table <code>public.fullcarddata</code>.
     */
    public final Fullcarddata FULLCARDDATA = Fullcarddata.FULLCARDDATA;

    /**
     * The table <code>public.fulllistdata</code>.
     */
    public final Fulllistdata FULLLISTDATA = Fulllistdata.FULLLISTDATA;

    /**
     * The table <code>public.listcards</code>.
     */
    public final Listcards LISTCARDS = Listcards.LISTCARDS;

    /**
     * The table <code>public.lists</code>.
     */
    public final Lists LISTS = Lists.LISTS;

    /**
     * The table <code>public.listslogos</code>.
     */
    public final Listslogos LISTSLOGOS = Listslogos.LISTSLOGOS;

    /**
     * The table <code>public.localaddresses</code>.
     */
    public final Localaddresses LOCALADDRESSES = Localaddresses.LOCALADDRESSES;

    /**
     * The table <code>public.namesandmultiverseid</code>.
     */
    public final Namesandmultiverseid NAMESANDMULTIVERSEID = Namesandmultiverseid.NAMESANDMULTIVERSEID;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Cards.CARDS,
            Fullcarddata.FULLCARDDATA,
            Fulllistdata.FULLLISTDATA,
            Listcards.LISTCARDS,
            Lists.LISTS,
            Listslogos.LISTSLOGOS,
            Localaddresses.LOCALADDRESSES,
            Namesandmultiverseid.NAMESANDMULTIVERSEID
        );
    }
}
