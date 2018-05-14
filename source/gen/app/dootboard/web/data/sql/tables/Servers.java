/*
 * This file is generated by jOOQ.
*/
package gen.app.dootboard.web.data.sql.tables;


import ceylon.language.Boolean;
import ceylon.language.Integer;
import ceylon.language.String;
import ceylon.time.DateTime;

import gen.app.dootboard.web.data.sql.Dootboard;
import gen.app.dootboard.web.data.sql.Indexes;
import gen.app.dootboard.web.data.sql.Keys;
import gen.app.dootboard.web.data.sql.tables.records.ServersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import pw.dotdash.adapt.jooq.codegen.BooleanConverter;
import pw.dotdash.adapt.jooq.codegen.DateTimeConverter;
import pw.dotdash.adapt.jooq.codegen.IntegerConverter;
import pw.dotdash.adapt.jooq.codegen.StringConverter;


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
public class Servers extends TableImpl<ServersRecord> {

    private static final long serialVersionUID = -1208686471;

    /**
     * The reference instance of <code>dootboard.servers</code>
     */
    public static final Servers servers = new Servers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServersRecord> getRecordType() {
        return ServersRecord.class;
    }

    /**
     * The column <code>dootboard.servers.name</code>.
     */
    public final TableField<ServersRecord, String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "", new StringConverter());

    /**
     * The column <code>dootboard.servers.online</code>.
     */
    public final TableField<ServersRecord, Boolean> online = createField("online", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "", new BooleanConverter());

    /**
     * The column <code>dootboard.servers.status</code>.
     */
    public final TableField<ServersRecord, String> status = createField("status", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("'Offline'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "", new StringConverter());

    /**
     * The column <code>dootboard.servers.player_count</code>.
     */
    public final TableField<ServersRecord, Integer> playerCount = createField("player_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "", new IntegerConverter());

    /**
     * The column <code>dootboard.servers.player_max</code>.
     */
    public final TableField<ServersRecord, Integer> playerMax = createField("player_max", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "", new IntegerConverter());

    /**
     * The column <code>dootboard.servers.ram_max</code>.
     */
    public final TableField<ServersRecord, Integer> ramMax = createField("ram_max", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "", new IntegerConverter());

    /**
     * The column <code>dootboard.servers.ram_used</code>.
     */
    public final TableField<ServersRecord, Integer> ramUsed = createField("ram_used", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "", new IntegerConverter());

    /**
     * The column <code>dootboard.servers.online_since</code>.
     */
    public final TableField<ServersRecord, DateTime> onlineSince = createField("online_since", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

    /**
     * Create a <code>dootboard.servers</code> table reference
     */
    public Servers() {
        this(DSL.name("servers"), null);
    }

    /**
     * Create an aliased <code>dootboard.servers</code> table reference
     */
    public Servers(java.lang.String alias) {
        this(DSL.name(alias), servers);
    }

    /**
     * Create an aliased <code>dootboard.servers</code> table reference
     */
    public Servers(Name alias) {
        this(alias, servers);
    }

    private Servers(Name alias, Table<ServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Servers(Name alias, Table<ServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dootboard.dootboard;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.serversNameUindex, Indexes.serversPkey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServersRecord> getPrimaryKey() {
        return Keys.serversPkey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServersRecord>> getKeys() {
        return Arrays.<UniqueKey<ServersRecord>>asList(Keys.serversPkey);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Servers as(java.lang.String alias) {
        return new Servers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Servers as(Name alias) {
        return new Servers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Servers rename(java.lang.String name) {
        return new Servers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Servers rename(Name name) {
        return new Servers(name, null);
    }
}
