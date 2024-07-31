/*
 * This file is generated by jOOQ.
 */
package org.example.mtgspotscrapper.model.databaseClasses.tables;


import java.math.BigDecimal;
import java.util.Collection;

import org.example.mtgspotscrapper.model.databaseClasses.Public;
import org.example.mtgspotscrapper.model.databaseClasses.tables.records.FulllistdataRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Fulllistdata extends TableImpl<FulllistdataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.fulllistdata</code>
     */
    public static final Fulllistdata FULLLISTDATA = new Fulllistdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FulllistdataRecord> getRecordType() {
        return FulllistdataRecord.class;
    }

    /**
     * The column <code>public.fulllistdata.list_id</code>.
     */
    public final TableField<FulllistdataRecord, Integer> LIST_ID = createField(DSL.name("list_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.fulllistdata.multiverse_id</code>.
     */
    public final TableField<FulllistdataRecord, Integer> MULTIVERSE_ID = createField(DSL.name("multiverse_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.fulllistdata.card_name</code>.
     */
    public final TableField<FulllistdataRecord, String> CARD_NAME = createField(DSL.name("card_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.fulllistdata.previous_price</code>.
     */
    public final TableField<FulllistdataRecord, BigDecimal> PREVIOUS_PRICE = createField(DSL.name("previous_price"), SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.fulllistdata.actual_price</code>.
     */
    public final TableField<FulllistdataRecord, BigDecimal> ACTUAL_PRICE = createField(DSL.name("actual_price"), SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.fulllistdata.image_url</code>.
     */
    public final TableField<FulllistdataRecord, String> IMAGE_URL = createField(DSL.name("image_url"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.fulllistdata.local_address</code>.
     */
    public final TableField<FulllistdataRecord, String> LOCAL_ADDRESS = createField(DSL.name("local_address"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.fulllistdata.list_name</code>.
     */
    public final TableField<FulllistdataRecord, String> LIST_NAME = createField(DSL.name("list_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.fulllistdata.logo_id</code>.
     */
    public final TableField<FulllistdataRecord, Integer> LOGO_ID = createField(DSL.name("logo_id"), SQLDataType.INTEGER, this, "");

    private Fulllistdata(Name alias, Table<FulllistdataRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Fulllistdata(Name alias, Table<FulllistdataRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "fulllistdata" as  SELECT listcards.list_id,
         fullcarddata.multiverse_id,
         fullcarddata.card_name,
         fullcarddata.previous_price,
         fullcarddata.actual_price,
         fullcarddata.image_url,
         fullcarddata.local_address,
         lists.list_name,
         lists.logo_id
        FROM ((fullcarddata
          JOIN listcards USING (multiverse_id))
          JOIN lists USING (list_id));
        """), where);
    }

    /**
     * Create an aliased <code>public.fulllistdata</code> table reference
     */
    public Fulllistdata(String alias) {
        this(DSL.name(alias), FULLLISTDATA);
    }

    /**
     * Create an aliased <code>public.fulllistdata</code> table reference
     */
    public Fulllistdata(Name alias) {
        this(alias, FULLLISTDATA);
    }

    /**
     * Create a <code>public.fulllistdata</code> table reference
     */
    public Fulllistdata() {
        this(DSL.name("fulllistdata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Fulllistdata as(String alias) {
        return new Fulllistdata(DSL.name(alias), this);
    }

    @Override
    public Fulllistdata as(Name alias) {
        return new Fulllistdata(alias, this);
    }

    @Override
    public Fulllistdata as(Table<?> alias) {
        return new Fulllistdata(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fulllistdata rename(String name) {
        return new Fulllistdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fulllistdata rename(Name name) {
        return new Fulllistdata(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fulllistdata rename(Table<?> name) {
        return new Fulllistdata(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata where(Condition condition) {
        return new Fulllistdata(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Fulllistdata where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Fulllistdata where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Fulllistdata where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Fulllistdata where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Fulllistdata whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
