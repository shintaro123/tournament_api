package club.uctennis.tournament.domain.mapper;

import club.uctennis.tournament.domain.model.PreEntries;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PreEntriesMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  @Delete({"delete from pre_entries", "where id = #{id,jdbcType=INTEGER}"})
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  @Insert({"insert into pre_entries (id, tournament_id, ", "team_name, representive_name, ",
      "email, phone, create_date, ", "update_date)",
      "values (#{id,jdbcType=INTEGER}, #{tournamentId,jdbcType=INTEGER}, ",
      "#{teamName,jdbcType=VARCHAR}, #{representiveName,jdbcType=VARCHAR}, ",
      "#{email,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
      "#{updateDate,jdbcType=TIMESTAMP})"})
  int insert(PreEntries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  int insertSelective(PreEntries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  @Select({"select", "id, tournament_id, team_name, representive_name, email, phone, create_date, ",
      "update_date", "from pre_entries", "where id = #{id,jdbcType=INTEGER}"})
  @ResultMap("club.uctennis.tournament.domain.mapper.PreEntriesMapper.BaseResultMap")
  PreEntries selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(PreEntries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table pre_entries
   * @mbg.generated
   */
  @Update({"update pre_entries", "set tournament_id = #{tournamentId,jdbcType=INTEGER},",
      "team_name = #{teamName,jdbcType=VARCHAR},",
      "representive_name = #{representiveName,jdbcType=VARCHAR},",
      "email = #{email,jdbcType=VARCHAR},", "phone = #{phone,jdbcType=VARCHAR},",
      "create_date = #{createDate,jdbcType=TIMESTAMP},",
      "update_date = #{updateDate,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=INTEGER}"})
  int updateByPrimaryKey(PreEntries record);
}