package Entities;
// Generated Jan 15, 2017 9:45:02 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vaitronguoidung generated by hbm2java
 */
@Entity
@Table(name = "vaitronguoidung", catalog = "qlbantuisach")
public class Vaitronguoidung implements java.io.Serializable {

	private Integer iduser;

	private int idrole;

	private int maKhachHang;

	private Date ngayTao;

	public Vaitronguoidung() {
	}

	public Vaitronguoidung(int idrole, int maKhachHang, Date ngayTao) {
		this.idrole = idrole;
		this.maKhachHang = maKhachHang;
		this.ngayTao = ngayTao;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDUser", unique = true, nullable = false)
	public Integer getIduser() {
		return this.iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	@Column(name = "IDRole", nullable = false)
	public int getIdrole() {
		return this.idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	@Column(name = "MaKhachHang", nullable = false)
	public int getMaKhachHang() {
		return this.maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NgayTao", nullable = false, length = 19)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

}
