/***************************************************************************
 *
 * Copyright (c) 2019 Chatopera.Inc, Inc. All Rights Reserved
 *
 **************************************************************************/

/**
 * @file /Users/hain/chatopera/chatopera.io/clause/src/sep/src/emoji.cpp
 * @author Hai Liang Wang(hain@chatopera.com)
 * @date 2019-09-04_10:48:38
 * @brief
 *
 **/
#include "emoji.h"
#include <boost/algorithm/string.hpp>
#include "glog/logging.h"

using namespace boost::algorithm;

namespace chatopera {
namespace bot {
namespace sep {


Emojis::Emojis() {
  _dict = new set<string>();
};

Emojis::~Emojis() {
  delete _dict;
};

bool Emojis::init(const string& config) {
  _dict->clear();
  // load words from file
  ifstream f(config);
  CHECK(f.is_open()) << "Can not open file " << config;

  string line;

  while(getline(f, line)) {
    trim(line);
    _dict->insert(line);
  }

  VLOG(2) << "load emojis [length " << _dict->size() << "] from " << config << " successfully." ;
  return true;
};

bool Emojis::contains(const string& word) {
  return _dict->find(word) != _dict->end();
};

} // namespace sep
} // namespace bot
} // namespace chatopera

/* vim: set expandtab ts=4 sw=4 sts=4 tw=100: */
