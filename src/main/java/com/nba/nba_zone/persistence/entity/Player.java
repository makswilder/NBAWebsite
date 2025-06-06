package com.nba.nba_zone.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {

    @Id
    @Column(name = "Player_name")
    private String name;

    @Column(name = "Nation")
    private String nation;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Position")
    private String pos;

    @Column(name = "Games_played")
    private Integer g;

    @Column(name = "Game_starts")
    private Integer gs;

    @Column(name = "Minutes_played")
    private Integer mp;

    @Column(name = "Field_goals_made")
    private Integer fg;

    @Column(name = "Three_points")
    private Integer threeP;

    @Column(name = "Two_points")
    private Integer twoP;

    @Column(name = "Assists")
    private Integer ast;

    @Column(name = "Blocks")
    private Integer blk;

    @Column(name = "Turnovers")
    private Integer tov;

    @Column(name = "Points")
    private Integer pts;

    @Column(name = "Team_name")
    private String team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String nation, Integer age, String pos, Integer g, Integer gs, Integer mp, Integer fg, Integer threeP, Integer twoP, Integer ast, Integer blk, Integer tov, Integer pts, String team) {
        this.name = name;
        this.nation = nation;
        this.age = age;
        this.pos = pos;
        this.g = g;
        this.gs = gs;
        this.mp = mp;
        this.fg = fg;
        this.threeP = threeP;
        this.twoP = twoP;
        this.ast = ast;
        this.blk = blk;
        this.tov = tov;
        this.pts = pts;
        this.team = team;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getGs() {
        return gs;
    }

    public void setGs(Integer gs) {
        this.gs = gs;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getFg() {
        return fg;
    }

    public void setFg(Integer fg) {
        this.fg = fg;
    }

    public Integer getThreeP() {
        return threeP;
    }

    public void setThreeP(Integer threeP) {
        this.threeP = threeP;
    }

    public Integer getTwoP() {
        return twoP;
    }

    public void setTwoP(Integer twoP) {
        this.twoP = twoP;
    }

    public Integer getAst() {
        return ast;
    }

    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Integer getBlk() {
        return blk;
    }

    public void setBlk(Integer blk) {
        this.blk = blk;
    }

    public Integer getTov() {
        return tov;
    }

    public void setTov(Integer tov) {
        this.tov = tov;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
