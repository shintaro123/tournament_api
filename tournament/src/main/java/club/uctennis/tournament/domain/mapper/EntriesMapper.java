package club.uctennis.tournament.domain.mapper;

import club.uctennis.tournament.domain.model.Entries;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EntriesMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  @Delete({"delete from entries", "where id = #{id,jdbcType=INTEGER}"})
  int deleteByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  @Insert({"insert into entries (id, tournament_id, ", "team_name, representive_name, ",
      "email, phone, create_date, ", "update_date)",
      "values (#{id,jdbcType=INTEGER}, #{tournamentId,jdbcType=INTEGER}, ",
      "#{teamName,jdbcType=VARCHAR}, #{representiveName,jdbcType=VARCHAR}, ",
      "#{email,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
      "#{updateDate,jdbcType=TIMESTAMP})"})
  int insert(Entries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  int insertSelective(Entries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  @Select({"select", "id, tournament_id, team_name, representive_name, email, phone, create_date, ",
      "update_date", "from entries", "where id = #{id,jdbcType=INTEGER}"})
  @ResultMap("club.uctennis.tournament.domain.mapper.EntriesMapper.BaseResultMap")
  Entries selectByPrimaryKey(Integer id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  int updateByPrimaryKeySelective(Entries record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table entries
   * @mbg.generated
   */
  @Update({"update entries", "set tournament_id = #{tournamentId,jdbcType=INTEGER},",
      "team_name = #{teamName,jdbcType=VARCHAR},",
      "representive_name = #{representiveName,jdbcType=VARCHAR},",
      "email = #{email,jdbcType=VARCHAR},", "phone = #{phone,jdbcType=VARCHAR},",
      "create_date = #{createDate,jdbcType=TIMESTAMP},",
      "update_date = #{updateDate,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=INTEGER}"})
  int updateByPrimaryKey(Entries record);
}