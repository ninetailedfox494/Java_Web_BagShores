package Entities;
// Generated Dec 17, 2016 4:50:57 PM by Hibernate Tools 5.2.0.CR1

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
 * Dondathang generated by hbm2java
 */
@Entity
@Table(name = "dondathang", catalog = "qlbantuisach")
public class Dondathang implements java.io.Serializable {

	private Integer maDonDatHang;

	private Date ngayDatHang;

	private Date ngayGiao;

	private boolean daThanhToan;

	private boolean tinhTrangGiao;

	private int maKhachHang;

	public Dondathang() {
	}

	public Dondathang(Date ngayDatHang, Date ngayGiao, boolean daThanhToan, boolean tinhTrangGiao, int maKhachHang) {
		this.ngayDatHang = ngayDatHang;
		this.ngayGiao = ngayGiao;
		this.daThanhToan = daThanhToan;
		this.tinhTrangGiao = tinhTrangGiao;
		this.maKhachHang = maKhachHang;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MaDonDatHang", unique = true, nullable = false)
	public Integer getMaDonDatHang() {
		return this.maDonDatHang;
	}

	public void setMaDonDatHang(Integer maDonDatHang) {
		this.maDonDatHang = maDonDatHang;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NgayDatHang", nullable = false, length = 19)
	public Date getNgayDatHang() {
		return this.ngayDatHang;
	}

	public void setNgayDatHang(Date ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayGiao", nullable = false, length = 10)
	public Date getNgayGiao() {
		return this.ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	@Column(name = "DaThanhToan", nullable = false)
	public boolean isDaThanhToan() {
		return this.daThanhToan;
	}

	public void setDaThanhToan(boolean daThanhToan) {
		this.daThanhToan = daThanhToan;
	}

	@Column(name = "TinhTrangGiao", nullable = false)
	public boolean isTinhTrangGiao() {
		return this.tinhTrangGiao;
	}

	public void setTinhTrangGiao(boolean tinhTrangGiao) {
		this.tinhTrangGiao = tinhTrangGiao;
	}

	@Column(name = "MaKhachHang", nullable = false)
	public int getMaKhachHang() {
		return this.maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

}
