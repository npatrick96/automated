/*
 * Java bean class for entity table tbl_book_genres 
 * Created on 1 Aug 2017 ( Date ISO 2017-08-01 - Time 21:57:02 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package org.demo.bean;

import java.io.Serializable;


/**
 * Entity bean for table "tbl_book_genres"
 * 
 * @author Telosys Tools Generator
 *
 */
public class TblBookGenres implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer    genreId      ; // Primary Key
    private Integer    bookid       ; // Primary Key


    /**
     * Default constructor
     */
    public TblBookGenres()
    {
        super();
    }
    
    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR THE PRIMARY KEY 
    //----------------------------------------------------------------------
    /**
     * Set the "genreId" field value
     * This field is mapped on the database column "genre_id" ( type "INT", NotNull : true ) 
     * @param genreId
     */
	public void setGenreId( Integer genreId )
    {
        this.genreId = genreId ;
    }
    /**
     * Get the "genreId" field value
     * This field is mapped on the database column "genre_id" ( type "INT", NotNull : true ) 
     * @return the field value
     */
	public Integer getGenreId()
    {
        return this.genreId;
    }
    /**
     * Set the "bookid" field value
     * This field is mapped on the database column "bookId" ( type "INT", NotNull : true ) 
     * @param bookid
     */
	public void setBookid( Integer bookid )
    {
        this.bookid = bookid ;
    }
    /**
     * Get the "bookid" field value
     * This field is mapped on the database column "bookId" ( type "INT", NotNull : true ) 
     * @return the field value
     */
	public Integer getBookid()
    {
        return this.bookid;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR DATA FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(genreId);
        sb.append("|");
        sb.append(bookid);
        return sb.toString(); 
    } 


}
