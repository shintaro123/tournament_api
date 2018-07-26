package club.uctennis.tournament.domain.mapper;

import club.uctennis.tournament.domain.model.OnetimeTokens;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OnetimeTokensMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    @Delete({
        "delete from onetime_tokens",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    @Insert({
        "insert into onetime_tokens (id, pre_entry_id, ",
        "token, limited_date, ",
        "create_date, update_date)",
        "values (#{id,jdbcType=INTEGER}, #{preEntryId,jdbcType=INTEGER}, ",
        "#{token,jdbcType=VARCHAR}, #{limitedDate,jdbcType=TIMESTAMP}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(OnetimeTokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    int insertSelective(OnetimeTokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, pre_entry_id, token, limited_date, create_date, update_date",
        "from onetime_tokens",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("club.uctennis.tournament.domain.mapper.OnetimeTokensMapper.BaseResultMap")
    OnetimeTokens selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OnetimeTokens record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onetime_tokens
     *
     * @mbg.generated
     */
    @Update({
        "update onetime_tokens",
        "set pre_entry_id = #{preEntryId,jdbcType=INTEGER},",
          "token = #{token,jdbcType=VARCHAR},",
          "limited_date = #{limitedDate,jdbcType=TIMESTAMP},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(OnetimeTokens record);
}