/**
 */
package html_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link html_model.TableCell#getAlignement <em>Alignement</em>}</li>
 *   <li>{@link html_model.TableCell#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see html_model.Html_modelPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link html_model.TableCellAlignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see html_model.TableCellAlignement
	 * @see #setAlignement(TableCellAlignement)
	 * @see html_model.Html_modelPackage#getTableCell_Alignement()
	 * @model
	 * @generated
	 */
	TableCellAlignement getAlignement();

	/**
	 * Sets the value of the '{@link html_model.TableCell#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see html_model.TableCellAlignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(TableCellAlignement value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(int)
	 * @see html_model.Html_modelPackage#getTableCell_Span()
	 * @model default="1"
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link html_model.TableCell#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

} // TableCell
