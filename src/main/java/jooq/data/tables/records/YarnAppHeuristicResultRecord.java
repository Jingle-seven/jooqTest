/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.records;


import javax.annotation.Generated;

import jooq.data.tables.YarnAppHeuristicResult;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YarnAppHeuristicResultRecord extends UpdatableRecordImpl<YarnAppHeuristicResultRecord> implements Record6<Integer, String, String, String, Boolean, UInteger> {

    private static final long serialVersionUID = 1177373845;

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.id</code>. The application heuristic result id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.id</code>. The application heuristic result id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.yarn_app_result_id</code>. The application id
     */
    public void setYarnAppResultId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.yarn_app_result_id</code>. The application id
     */
    public String getYarnAppResultId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.heuristic_class</code>. Name of the JVM class that implements this heuristic
     */
    public void setHeuristicClass(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.heuristic_class</code>. Name of the JVM class that implements this heuristic
     */
    public String getHeuristicClass() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.heuristic_name</code>. The heuristic name
     */
    public void setHeuristicName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.heuristic_name</code>. The heuristic name
     */
    public String getHeuristicName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.severity</code>. The heuristic severity ranging from 0(LOW) to 4(CRITICAL)
     */
    public void setSeverity(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.severity</code>. The heuristic severity ranging from 0(LOW) to 4(CRITICAL)
     */
    public Boolean getSeverity() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>cloudins.yarn_app_heuristic_result.score</code>. The heuristic score for the application. score = severity * number_of_tasks(map/reduce) where severity not in [0,1], otherwise score = 0
     */
    public void setScore(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloudins.yarn_app_heuristic_result.score</code>. The heuristic score for the application. score = severity * number_of_tasks(map/reduce) where severity not in [0,1], otherwise score = 0
     */
    public UInteger getScore() {
        return (UInteger) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Boolean, UInteger> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Boolean, UInteger> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.YARN_APP_RESULT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.HEURISTIC_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.HEURISTIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.SEVERITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getYarnAppResultId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getHeuristicClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getHeuristicName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getSeverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value2(String value) {
        setYarnAppResultId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value3(String value) {
        setHeuristicClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value4(String value) {
        setHeuristicName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value5(Boolean value) {
        setSeverity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord value6(UInteger value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YarnAppHeuristicResultRecord values(Integer value1, String value2, String value3, String value4, Boolean value5, UInteger value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached YarnAppHeuristicResultRecord
     */
    public YarnAppHeuristicResultRecord() {
        super(YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT);
    }

    /**
     * Create a detached, initialised YarnAppHeuristicResultRecord
     */
    public YarnAppHeuristicResultRecord(Integer id, String yarnAppResultId, String heuristicClass, String heuristicName, Boolean severity, UInteger score) {
        super(YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT);

        set(0, id);
        set(1, yarnAppResultId);
        set(2, heuristicClass);
        set(3, heuristicName);
        set(4, severity);
        set(5, score);
    }
}
