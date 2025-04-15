import axios from 'axios'

const BASE = '/api/products'
export const get = async (target, params) => {
  try {
    console.log('[GET]', BASE + target, params)
    const { data } = await axios.get(BASE + target, { params })
    return data
  } catch (e) {
    console.log('[ERROR]', e)
  }
  return []
}

export const post = async (target, product) => {
  try {
    console.log('[POST]', BASE + target, product)
    const { data } = await axios.post(BASE + target, product)
    return data
  } catch (e) {
    console.error(e)
  }
  return {}
}

export const put = async (target, product) => {
  try {
    console.log('[PUT]', BASE + target, product)
    const { data } = await axios.put(BASE + target, product)
    return data
  } catch (e) {
    console.error(e)
  }
  return {}
}

export const remove = async (target, params) => {
  try {
    console.log('[DELETE]', BASE + target, params)
    const { data } = await axios.delete(BASE + target, { params })
    return data
  } catch (e) {
    console.error(e)
  }
  return {}
}
