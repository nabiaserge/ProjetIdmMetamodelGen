/**
 */
package ppuy1;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppuy1.Calendrier#getEvenement <em>Evenement</em>}</li>
 *   <li>{@link ppuy1.Calendrier#getDebut <em>Debut</em>}</li>
 *   <li>{@link ppuy1.Calendrier#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @see ppuy1.ppuy1Package#getCalendrier()
 * @model
 * @generated
 */
public interface Calendrier extends Contenu {
	/**
	 * Returns the value of the '<em><b>Evenement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement</em>' attribute.
	 * @see #setEvenement(String)
	 * @see ppuy1.ppuy1Package#getCalendrier_Evenement()
	 * @model
	 * @generated
	 */
	String getEvenement();

	/**
	 * Sets the value of the '{@link ppuy1.Calendrier#getEvenement <em>Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evenement</em>' attribute.
	 * @see #getEvenement()
	 * @generated
	 */
	void setEvenement(String value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(Date)
	 * @see ppuy1.ppuy1Package#getCalendrier_Debut()
	 * @model
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link ppuy1.Calendrier#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(Date)
	 * @see ppuy1.ppuy1Package#getCalendrier_Fin()
	 * @model
	 * @generated
	 */
	Date getFin();

	/**
	 * Sets the value of the '{@link ppuy1.Calendrier#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Date value);

} // Calendrier
