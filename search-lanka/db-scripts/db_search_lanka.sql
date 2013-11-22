DROP DATABASE IF EXISTS db_search_lanka;
CREATE DATABASE db_search_lanka;

USE db_search_lanka;

DROP TABLE IF EXISTS venders;
CREATE TABLE IF NOT EXISTS venders (
  vender_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  category_id INT UNSIGNED NOT NULL,
  location_id INT UNSIGNED NOT NULL,
  name VARCHAR(200) NOT NULL,
  about VARCHAR(2000) NOT NULL,
  username VARCHAR(10) DEFAULT NULL,
  password VARCHAR(10) DEFAULT NULL,
  PRIMARY KEY (vender_id),
  KEY category_id (category_id),
  KEY location_id (location_id)
); 

DROP TABLE IF EXISTS vender_locations;
CREATE TABLE vender_locations(
	location_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	location VARCHAR(50),
	country VARCHAR(50),
	state_province VARCHAR(50),
	city VARCHAR(50),
	zip_code VARCHAR(5),
	latitude VARCHAR(50),
	longitude VARCHAR(50),
	address VARCHAR(200),
	PRIMARY KEY(location_id)
);

DROP TABLE IF EXISTS vender_categories;
CREATE TABLE IF NOT EXISTS vender_categories (
  category_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  category_name VARCHAR(100) NOT NULL,
  discription VARCHAR(500) NOT NULL,
  image VARCHAR(500) DEFAULT NULL,
  PRIMARY KEY (category_id)
); 

DROP TABLE IF EXISTS vender_posts;
CREATE TABLE IF NOT EXISTS posts (
  post_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  title  VARCHAR(100) NOT NULL,
  discription VARCHAR(500) DEFAULT NULL,
  image VARCHAR(500) DEFAULT NULL,
  vender_id INT UNSIGNED NOT NULL,
  KEY vender_id (vender_id),
  PRIMARY KEY (post_id)
);

DROP TABLE IF EXISTS tags;
CREATE TABLE tags(
	tag_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	tag_name VARCHAR(50) NOT NULL,
	tag_info VARCHAR(200) NOT NULL,
	urls VARCHAR(500),
	PRIMARY KEY(tag_id)
); 

DROP TABLE IF EXISTS vender_post_tags;
CREATE TABLE vender_post_tags(
  post_id INT UNSIGNED NOT NULL,
  tag_id INT UNSIGNED NOT NULL,
  KEY tag_id (tag_id),
  KEY post_id (post_id)
); 

