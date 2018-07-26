package club.uctennis.tournament.domain.model;

import java.time.LocalDateTime;

public class PreEntries {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.tournament_id
     *
     * @mbg.generated
     */
    private Integer tournamentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.team_name
     *
     * @mbg.generated
     */
    private String teamName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.representive_name
     *
     * @mbg.generated
     */
    private String representiveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.create_date
     *
     * @mbg.generated
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_entries.update_date
     *
     * @mbg.generated
     */
    private LocalDateTime updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.id
     *
     * @return the value of pre_entries.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.id
     *
     * @param id the value for pre_entries.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.tournament_id
     *
     * @return the value of pre_entries.tournament_id
     *
     * @mbg.generated
     */
    public Integer getTournamentId() {
        return tournamentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.tournament_id
     *
     * @param tournamentId the value for pre_entries.tournament_id
     *
     * @mbg.generated
     */
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.team_name
     *
     * @return the value of pre_entries.team_name
     *
     * @mbg.generated
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.team_name
     *
     * @param teamName the value for pre_entries.team_name
     *
     * @mbg.generated
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.representive_name
     *
     * @return the value of pre_entries.representive_name
     *
     * @mbg.generated
     */
    public String getRepresentiveName() {
        return representiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.representive_name
     *
     * @param representiveName the value for pre_entries.representive_name
     *
     * @mbg.generated
     */
    public void setRepresentiveName(String representiveName) {
        this.representiveName = representiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.email
     *
     * @return the value of pre_entries.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.email
     *
     * @param email the value for pre_entries.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.phone
     *
     * @return the value of pre_entries.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.phone
     *
     * @param phone the value for pre_entries.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.create_date
     *
     * @return the value of pre_entries.create_date
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.create_date
     *
     * @param createDate the value for pre_entries.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pre_entries.update_date
     *
     * @return the value of pre_entries.update_date
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pre_entries.update_date
     *
     * @param updateDate the value for pre_entries.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}