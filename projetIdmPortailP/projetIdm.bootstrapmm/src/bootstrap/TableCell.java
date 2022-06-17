/**
 */
package bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.TableCell#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link bootstrap.TableCell#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link bootstrap.Alignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see bootstrap.Alignement
	 * @see #setAlignment(Alignement)
	 * @see bootstrap.BootstrapPackage#getTableCell_Alignment()
	 * @model
	 * @generated
	 */
	Alignement getAlignment();

	/**
	 * Sets the value of the '{@link bootstrap.TableCell#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see bootstrap.Alignement
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignement value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(String)
	 * @see bootstrap.BootstrapPackage#getTableCell_Span()
	 * @model
	 * @generated
	 */
	String getSpan();

	/**
	 * Sets the value of the '{@link bootstrap.TableCell#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(String value);

} // TableCell
