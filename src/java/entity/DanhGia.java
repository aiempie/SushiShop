/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ChristianEriksen
 */
public class DanhGia {
    private String idSP;
    private float soSao;
    private String comment;
    private int luotdanhgia;

    public DanhGia() {
    }

    public DanhGia(String idSP, float soSao, String comment, int luotdanhgia) {
        this.idSP = idSP;
        this.soSao = soSao;
        this.comment = comment;
        this.luotdanhgia = luotdanhgia;
    }

    public int getLuotdanhgia() {
        return luotdanhgia;
    }

    public void setLuotdanhgia(int luotdanhgia) {
        this.luotdanhgia = luotdanhgia;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public float getSoSao() {
        return soSao;
    }

    public void setSoSao(float soSao) {
        this.soSao = soSao;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
