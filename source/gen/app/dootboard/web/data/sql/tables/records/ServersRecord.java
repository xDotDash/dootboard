/*
 * This file is generated by jOOQ.
*/
package gen.app.dootboard.web.data.sql.tables.records;


import ceylon.language.Boolean;
import ceylon.language.Integer;
import ceylon.language.String;
import ceylon.time.DateTime;

import gen.app.dootboard.web.data.sql.tables.Servers;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServersRecord extends UpdatableRecordImpl<ServersRecord> implements Record8<String, Boolean, String, Integer, Integer, Integer, Integer, DateTime> {

    private static final long serialVersionUID = -1713998506;

    /**
     * Setter for <code>dootboard.servers.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dootboard.servers.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dootboard.servers.online</code>.
     */
    public void setOnline(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>dootboard.servers.online</code>.
     */
    public Boolean getOnline() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>dootboard.servers.status</code>.
     */
    public void setStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dootboard.servers.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dootboard.servers.player_count</code>.
     */
    public void setPlayerCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dootboard.servers.player_count</code>.
     */
    public Integer getPlayerCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dootboard.servers.player_max</code>.
     */
    public void setPlayerMax(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dootboard.servers.player_max</code>.
     */
    public Integer getPlayerMax() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dootboard.servers.ram_max</code>.
     */
    public void setRamMax(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>dootboard.servers.ram_max</code>.
     */
    public Integer getRamMax() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>dootboard.servers.ram_used</code>.
     */
    public void setRamUsed(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>dootboard.servers.ram_used</code>.
     */
    public Integer getRamUsed() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>dootboard.servers.online_since</code>.
     */
    public void setOnlineSince(DateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>dootboard.servers.online_since</code>.
     */
    public DateTime getOnlineSince() {
        return (DateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Boolean, String, Integer, Integer, Integer, Integer, DateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Boolean, String, Integer, Integer, Integer, Integer, DateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Servers.servers.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Servers.servers.online;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Servers.servers.status;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Servers.servers.playerCount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Servers.servers.playerMax;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Servers.servers.ramMax;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Servers.servers.ramUsed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field8() {
        return Servers.servers.onlineSince;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getOnline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPlayerCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPlayerMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRamMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRamUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime component8() {
        return getOnlineSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getOnline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPlayerCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPlayerMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRamMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRamUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value8() {
        return getOnlineSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value2(Boolean value) {
        setOnline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value3(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value4(Integer value) {
        setPlayerCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value5(Integer value) {
        setPlayerMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value6(Integer value) {
        setRamMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value7(Integer value) {
        setRamUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord value8(DateTime value) {
        setOnlineSince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServersRecord values(String value1, Boolean value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, DateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServersRecord
     */
    public ServersRecord() {
        super(Servers.servers);
    }

    /**
     * Create a detached, initialised ServersRecord
     */
    public ServersRecord(String name, Boolean online, String status, Integer playerCount, Integer playerMax, Integer ramMax, Integer ramUsed, DateTime onlineSince) {
        super(Servers.servers);

        set(0, name);
        set(1, online);
        set(2, status);
        set(3, playerCount);
        set(4, playerMax);
        set(5, ramMax);
        set(6, ramUsed);
        set(7, onlineSince);
    }
}
