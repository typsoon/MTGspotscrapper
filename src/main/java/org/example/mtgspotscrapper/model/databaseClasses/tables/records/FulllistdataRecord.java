/*
 * This file is generated by jOOQ.
 */
package org.example.mtgspotscrapper.model.databaseClasses.tables.records;


import java.math.BigDecimal;

import org.example.mtgspotscrapper.model.databaseClasses.tables.Fulllistdata;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FulllistdataRecord extends TableRecordImpl<FulllistdataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.fulllistdata.list_id</code>.
     */
    public void setListId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.fulllistdata.list_id</code>.
     */
    public Integer getListId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.fulllistdata.multiverse_id</code>.
     */
    public void setMultiverseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.fulllistdata.multiverse_id</code>.
     */
    public Integer getMultiverseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.fulllistdata.card_name</code>.
     */
    public void setCardName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.fulllistdata.card_name</code>.
     */
    public String getCardName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.fulllistdata.previous_price</code>.
     */
    public void setPreviousPrice(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.fulllistdata.previous_price</code>.
     */
    public BigDecimal getPreviousPrice() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.fulllistdata.actual_price</code>.
     */
    public void setActualPrice(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.fulllistdata.actual_price</code>.
     */
    public BigDecimal getActualPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.fulllistdata.image_url</code>.
     */
    public void setImageUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.fulllistdata.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.fulllistdata.local_address</code>.
     */
    public void setLocalAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.fulllistdata.local_address</code>.
     */
    public String getLocalAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.fulllistdata.list_name</code>.
     */
    public void setListName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.fulllistdata.list_name</code>.
     */
    public String getListName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.fulllistdata.logo_id</code>.
     */
    public void setLogoId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.fulllistdata.logo_id</code>.
     */
    public Integer getLogoId() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FulllistdataRecord
     */
    public FulllistdataRecord() {
        super(Fulllistdata.FULLLISTDATA);
    }

    /**
     * Create a detached, initialised FulllistdataRecord
     */
    public FulllistdataRecord(Integer listId, Integer multiverseId, String cardName, BigDecimal previousPrice, BigDecimal actualPrice, String imageUrl, String localAddress, String listName, Integer logoId) {
        super(Fulllistdata.FULLLISTDATA);

        setListId(listId);
        setMultiverseId(multiverseId);
        setCardName(cardName);
        setPreviousPrice(previousPrice);
        setActualPrice(actualPrice);
        setImageUrl(imageUrl);
        setLocalAddress(localAddress);
        setListName(listName);
        setLogoId(logoId);
        resetChangedOnNotNull();
    }
}
